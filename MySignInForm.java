package foo.bar;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class MySignInForm extends Form<Void> {

	public MySignInForm(String id) {
		super(id);
	}

	private DataManagement data;

	public void enteringData() {

		data = new DataManagement();

		add(new TextField<>("username", new PropertyModel<>(data, "userName")));
		add(new PasswordTextField("password", new PropertyModel<>(data, "psw")));
	}

	@Override
	public final void onSubmit() {

		data.getUserName();
		data.getPsw();

	}
}
