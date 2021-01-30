package lk.mobitel.esms.io;
/**
 * @author firnas
 *
 */
import java.util.logging.Level;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.logging.Logger;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.resource.SmsProvider;
import lk.mobitel.esms.session.NullSessionException;
import lk.mobitel.esms.session.SessionManager;
import lk.mobitel.esms.ws.SmsMessage;
@RestController
@RequestMapping("/sms")
public class sms implements SmsProvider{
	


	@GetMapping("/go/{Recipients}/{Message}")
	@Override
	public String SendSMS(@PathVariable String Recipients,@PathVariable String Message) {
		
		lk.mobitel.esms.ws.User user =new lk.mobitel.esms.ws.User();
		user.setUsername("esmsusr_ote");
		user.setPassword("43v64l");
		lk.mobitel.esms.test.ServiceTest st = new
				lk.mobitel.esms.test.ServiceTest ();
				System.out.println(st.testService(user));
				
				SessionManager sm = SessionManager.getInstance();
				sm.login(user);
				//sm.isSession();
				System.out.println(sm.isSession());
			
				//boolean isSession = sm.isSession();
				
				
				//System.out.println(isSession = sm.isSession());
				SmsMessage msg = new SmsMessage();
				msg.setMessage(Message);
				msg.setSender("NIBMlibrary");
				msg.setMessageType(1);
				/** recipients per SMSMessage is limited to 500 **/
				msg.getRecipients().add(Recipients);
				
				
				try {
					System.out.println(msg.getRecipients());
					System.out.println("sending mode");
				SMSManager smsMgr = new SMSManager();
				smsMgr.sendMessage(msg);
				return"sms send success";
				} catch (Exception ex) {
					
				System.out.println(ex.toString());
			   return  ex.toString();
				}
		         
		
		
		
		
	
	}
	
	

}
