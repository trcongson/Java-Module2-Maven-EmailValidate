package controller;

import java.util.Locale;
import java.util.regex.Matcher;

public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public HomeController(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home(Locale locale, Model model){
        return "home"();
    }

    @RequestMapping(value = "/validate", method=RequestMethod.POST){
        public String user(@RequestParam("email")String email, ModelMap model){
            boolean isvalid = this.validate(email);
            if (!isvaild){
                model.addAttribute("message","Email is invalid");
                return "home";
            }
            model.addAttribute("email",email);
            return "success";
        }
        private boolean validate(String regex){
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
}
