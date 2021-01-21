
package lk.mobitel.esms.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnterpriseSMSWS", targetNamespace = "http://ws.esms.mobitel.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnterpriseSMSWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "serviceTest", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.ServiceTest")
    @ResponseWrapper(localName = "serviceTestResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.ServiceTestResponse")
    public String serviceTest(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param user
     * @return
     *     returns lk.mobitel.esms.ws.Session
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createSession", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.CreateSession")
    @ResponseWrapper(localName = "createSessionResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.CreateSessionResponse")
    public Session createSession(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param session
     * @return
     *     returns lk.mobitel.esms.ws.Session
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "renewSession", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.RenewSession")
    @ResponseWrapper(localName = "renewSessionResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.RenewSessionResponse")
    public Session renewSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session);

    /**
     * 
     * @param session
     */
    @WebMethod
    @RequestWrapper(localName = "closeSession", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.CloseSession")
    @ResponseWrapper(localName = "closeSessionResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.CloseSessionResponse")
    public void closeSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session);

    /**
     * 
     * @param session
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isSession", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.IsSession")
    @ResponseWrapper(localName = "isSessionResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.IsSessionResponse")
    public Boolean isSession(
        @WebParam(name = "session", targetNamespace = "")
        Session session);

    /**
     * 
     * @param smsMessage
     * @param session
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessages", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendMessages")
    @ResponseWrapper(localName = "sendMessagesResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendMessagesResponse")
    public int sendMessages(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsMessage", targetNamespace = "")
        SmsMessage smsMessage);

    /**
     * 
     * @param session
     * @param smsMessageMultiLang
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessagesMultiLang", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendMessagesMultiLang")
    @ResponseWrapper(localName = "sendMessagesMultiLangResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendMessagesMultiLangResponse")
    public int sendMessagesMultiLang(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsMessageMultiLang", targetNamespace = "")
        SmsMessageMultiLang smsMessageMultiLang);

    /**
     * 
     * @param smsCampaignMessage
     * @param session
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendCampaignMessages", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendCampaignMessages")
    @ResponseWrapper(localName = "sendCampaignMessagesResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.SendCampaignMessagesResponse")
    public int sendCampaignMessages(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "smsCampaignMessage", targetNamespace = "")
        SmsCampaignMessage smsCampaignMessage);

    /**
     * 
     * @param session
     * @param shortcode
     * @return
     *     returns java.util.List<lk.mobitel.esms.ws.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessagesFromShortcode", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetMessagesFromShortcode")
    @ResponseWrapper(localName = "getMessagesFromShortcodeResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetMessagesFromShortcodeResponse")
    public List<SmsMessage> getMessagesFromShortcode(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "shortcode", targetNamespace = "")
        String shortcode);

    /**
     * 
     * @param session
     * @param longNumber
     * @return
     *     returns java.util.List<lk.mobitel.esms.ws.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessagesFromLongNumber", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetMessagesFromLongNumber")
    @ResponseWrapper(localName = "getMessagesFromLongNumberResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetMessagesFromLongNumberResponse")
    public List<SmsMessage> getMessagesFromLongNumber(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "longNumber", targetNamespace = "")
        String longNumber);

    /**
     * 
     * @param endDate
     * @param session
     * @param alias
     * @param startDate
     * @return
     *     returns java.util.List<lk.mobitel.esms.ws.SentMessages>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSentMessageReports", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetSentMessageReports")
    @ResponseWrapper(localName = "getSentMessageReportsResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetSentMessageReportsResponse")
    public List<SentMessages> getSentMessageReports(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "")
        String endDate,
        @WebParam(name = "alias", targetNamespace = "")
        String alias);

    /**
     * 
     * @param session
     * @param alias
     * @return
     *     returns java.util.List<lk.mobitel.esms.ws.SmsMessage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDeliveryReports", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetDeliveryReports")
    @ResponseWrapper(localName = "getDeliveryReportsResponse", targetNamespace = "http://ws.esms.mobitel.lk/", className = "lk.mobitel.esms.ws.GetDeliveryReportsResponse")
    public List<SmsMessage> getDeliveryReports(
        @WebParam(name = "session", targetNamespace = "")
        Session session,
        @WebParam(name = "alias", targetNamespace = "")
        String alias);

}
