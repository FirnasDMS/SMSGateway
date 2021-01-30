/**
 * 
 */
package lk.mobitel.esms.resource;

/**
 * @author firnas
 *
 */
public interface SmsProvider {

	
	public String SendSMS(String Recipients,String Message);
	
}
