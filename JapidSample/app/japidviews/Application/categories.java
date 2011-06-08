package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/categories.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class categories extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/Application/categories.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 



// -- set up the tag objects
final categories _categories0 = this;
{ _categories0.setActionRunners(getActionRunners()); }

// -- end of the tag objects

	public categories() {
		super(null);
	}
	public categories(StringBuilder out) {
		super(out);
	}
	private List<Category> categories;
	public cn.bran.japid.template.RenderResult render(List<Category> categories) {
		this.categories = categories;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
p(" ");// line 1
 if(asBoolean(categories)) {// line 2
p("     <ul>\n" + 
"       ");// line 2
for(Category cat: categories) {// line 4
p("	       <li>\n" + 
"	           <a href=\"\">");// line 4
p(cat.name);// line 6
p("</a>\n" + 
"	           ");// line 6
_categories0.setOut(getOut()); _categories0.render(cat.subCategories);
// line 7
p("	       </li>\n" + 
"       ");// line 7
}// line 9
p("     </ul>\n" + 
" ");// line 9
}// line 11

	}

}