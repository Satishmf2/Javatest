//import org.codehaus.jackson.map.ObjectMapper;
//
//import java.io.IOException;
//
//public class JasonUtil {
//    private static ObjectMapper mapper;
//
//    static{
//        mapper=new ObjectMapper();
//    }
//
//    public static String convertJavaToJason(Object object)  {
//        String jsonResult= null;
//        try {
//                jsonResult = mapper.writeValueAsString(object);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return jsonResult;
//
//    }
//
//    //convert json to java
//
//    public static <T> T Convertjsontojava(String jsonString, Class<T> cls) {
//        T result = null;
//        try {
//            result = mapper.readValue(jsonString, cls);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//    }
//
