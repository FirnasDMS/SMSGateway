package lk.mobitel.esms.message;

import java.util.logging.Level;

import com.sun.istack.logging.Logger;

import lk.mobitel.esms.session.NullSessionException;
import lk.mobitel.esms.session.SessionManager;
import lk.mobitel.esms.ws.SmsMessage;

public class sms {
	
	public static void main(String []s) {
		
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
				msg.setMessage(" Its test SMS from DMS Software division ");
				msg.setSender("NIBMlibrary");
				msg.setMessageType(1);
				/** recipients per SMSMessage is limited to 500 **/
				//msg.getRecipients().add("94762200695");
				msg.getRecipients().add("94762011140");
				//msg.getRecipients().add("94776765633");
				//msg.getRecipients().add("94777344224");
				//msg.getRecipients().add("94779902833");
				//msg.getRecipients().add("94716852972");
				//msg.getRecipients().add("94771808101");
				//msg.getRecipients().add("94710902111");
				//msg.getRecipients().add("94702817681");
				
				try {
					System.out.println(msg.getRecipients());
					System.out.println("sending mode");
				SMSManager smsMgr = new SMSManager();
				smsMgr.sendMessage(msg);
				} catch (NullSessionException ex) {
					
				System.out.println("error mode");
			System.out.println(ex);
				}
		 
		
	}
	
	public void send() {
		lk.mobitel.esms.ws.User user =new lk.mobitel.esms.ws.User();
		user.setUsername("dfgfg");
		user.setPassword("fdgdfg");
		lk.mobitel.esms.test.ServiceTest st = new
				lk.mobitel.esms.test.ServiceTest ();
				System.out.println(st.testService(user));
		 
	}

}
