package JSON;

import org.json.JSONObject;

public class JsonDemo {
    public static void main(String[] args) {
        // Create a JSON object
        JSONObject obj = new JSONObject();
        obj.put("name", "Alice");
        obj.put("age", 25);
        obj.put("isStudent", true);

        // Convert JSON object to string
        String jsonString = obj.toString();
        System.out.println("JSON String: " + jsonString);

        // Parse JSON string back to JSONObject
        JSONObject parsedObj = new JSONObject(jsonString);
        System.out.println("Name: " + parsedObj.getString("name"));
        System.out.println("Age: " + parsedObj.getInt("age"));
        System.out.println("Is Student: " + parsedObj.getBoolean("isStudent"));
    }
}
