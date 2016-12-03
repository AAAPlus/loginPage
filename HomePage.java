package foo.bar;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class HomePage extends WebPage {

    /**
     * Constructor that is invoked when page is invoked without a session.
     */
	
    public HomePage(final PageParameters parameters) {
    	
    	add(new Form<>("myForm"));

    	MySignInForm signingIn = new MySignInForm("MyForm");
    	signingIn.enteringData();
    	
        
    }
        
    
}