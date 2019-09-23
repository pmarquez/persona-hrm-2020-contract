package io.nordstar.personahrm.contract.model.external;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author pmarquez - 2016-04-28 21:35
 */
public class PersonResponseRec {
    private PersonRec     payload;
    private String        resultCode         = "";
    private String        resultMessage      = "";
    private LocalDateTime opTimestamp        = LocalDateTime.now ( );
    
    /**
     * @return the payload
     */
    public PersonRec getPayload ( ) {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload ( PersonRec payload ) {
        this.payload = payload;
    }

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode the resultCode to set
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the resultMessage
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * @param resultMessage the resultMessage to set
     */
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    /**
     * @return the opTimestamp
     */
    @JsonIgnore
    public String getOpTimestampDate ( ) {
        return opTimestamp.format ( DateTimeFormatter.ofPattern ( "dd-MM-yyyy" ) );
    }

    @JsonIgnore
    public String getOpTimestampTime ( ) {
        return opTimestamp.format ( DateTimeFormatter.ofPattern ( "HH:mm:ss" ) );
    }

    public String getOpTimestamp ( ) {
        return opTimestamp.format ( DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss" ) );
    }

    @JsonIgnore
    public LocalDateTime getOpTimestampLDT ( ) {
        return opTimestamp;
    }

    /**
     * @param opTimestamp the opTimestamp to set
     */
//    @JsonIgnore
    public void setOpTimestamp ( String opTimestamp ) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss" );
        try {
            this.opTimestamp = LocalDateTime.parse ( opTimestamp, dtf );
        } catch ( DateTimeParseException dtpe ) {            
            this.opTimestamp = LocalDateTime.MIN;
        }
    }

    @JsonIgnore
    public void setDateRequested ( LocalDateTime opTimestamp ) {
        this.opTimestamp = opTimestamp;
    }

    /**
     * Utility method that dumps the contents of a DocumentRec for trace and debugging purposes.
     */
    public void spillYourGuts ( ) {
        System.out.println ( "************************************************************************" );
        System.out.println ( "**** ResponseRec *******************************************************" );
        System.out.println ( "************************************************************************" );
        System.out.println ( "**** Result Code    : " + this.getResultCode                        ( ) );
        System.out.println ( "**** Result Message : " + this.getResultMessage                     ( ) );
        System.out.println ( "**** Op Timestamp   : " + this.getOpTimestamp                       ( ) );
        System.out.println ( "************************************************************************" );
        System.out.println ( "************************************************************************" );
        System.out.println ( "************************************************************************" );
    }
    
}
