package dk.easyliving.dto.log;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Timestamp;

public class Log {
    Timestamp timestamp;
    String host;
    String process;
    int errorLevel; // 0-7
    String message;

    public Log(Timestamp timestamp, String host, String process, int errorLevel, String message) {
        this.timestamp = timestamp;
        this.host = host;
        this.process = process;
        this.errorLevel = errorLevel;
        this.message = message;
    }

    public Log() {
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getHost() {
        return host;
    }

    public String getProcess() {
        return process;
    }

    public int getErrorLevel() {
        return errorLevel;
    }

    public String getMessage() {
        return message;
    }

    public String toJson(){
        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = "";
        try {
            jsonStr = Obj.writeValueAsString(this);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return jsonStr;
    }
}
