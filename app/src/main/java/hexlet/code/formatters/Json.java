package hexlet.code.formatters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hexlet.code.LineDiff;

import java.util.Map;

public class Json {
    public static String getFormatter(Map<String, LineDiff> data) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(data);
    }
}
