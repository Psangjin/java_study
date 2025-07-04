package study.practice.practice56;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice56 {

	public static void main(String[] args) throws Exception {
		String jsonText = "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"John Doe\",\r\n"
				+ "\"contacts\": [\r\n"
				+ "{\r\n"
				+ "\"type\": \"email\",\r\n"
				+ "\"value\": \"john.doe@example.com\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"type\": \"phone\",\r\n"
				+ "\"value\": \"01023456789\"\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"address\": {\r\n"
				+ "\"street\": \"123 Main Street\",\r\n"
				+ "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n"
				+ "},\r\n"
				+ "\"orders\": [\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n"
				+ "\"date\": \"2024-07-09\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"Smartphone\",\r\n"
				+ "\"quantity\": 2\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"Laptop\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-002\",\r\n"
				+ "\"date\": \"2024-07-10\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 3,\r\n"
				+ "\"name\": \"Headphones\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject)parser.parse(jsonText);
		
		UserDTO user = new UserDTO();
		
		user.setId(objectToInt(obj.get("id")));
		user.setName(valueToString(obj.get("name")));
		
		
		JSONArray contacts = (JSONArray)obj.get("contacts");
		
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		for(int i=0; i<contacts.size(); i++) {
			
			ContactDTO contact = new ContactDTO();
			contact.setType(valueToString(((JSONObject)contacts.get(i)).get("type")));
			contact.setValue(valueToString(((JSONObject)contacts.get(i)).get("value")));
			contactList.add(contact);
		}
		
		user.setContacts(contactList);
		
		
		JSONObject address = (JSONObject)obj.get("address");
		AddressDTO addressDTO = new AddressDTO();
		
		addressDTO.setStreet(valueToString(address.get("street")));	
		addressDTO.setCity(valueToString(address.get("city")));
		addressDTO.setZipcode(valueToString(address.get("zipcode")));
		
		user.setAddress(addressDTO);
		
		
		
		JSONArray orders = (JSONArray)obj.get("orders");
		List<OrderDTO> orderList = new ArrayList<OrderDTO>();
		
		for(int i=0; i<orders.size(); i++) {
			JSONObject order = (JSONObject)orders.get(i);
			
			OrderDTO orderDTO = new OrderDTO();
			orderDTO.setOrderId(valueToString(order.get("orderId")));
			orderDTO.setDate(valueToString(order.get("date")));
			JSONArray items = (JSONArray)order.get("items");
			
			
			List<ItemDTO> itemList = new ArrayList<ItemDTO>();
			for(int j=0; j<items.size(); j++) {
				JSONObject item = (JSONObject)items.get(j);
				ItemDTO itemDTO = new ItemDTO();
				
				itemDTO.setId(objectToInt(item.get("id")));
				itemDTO.setName(valueToString(item.get("name")));
				itemDTO.setQuantity(objectToInt(item.get("quantity")));
				
				itemList.add(itemDTO);
			}
			
			orderDTO.setItems(itemList);
			
			orderList.add(orderDTO);
		}
		
		user.setOrders(orderList);
		
		System.out.println(user);
	}

	
	public static int objectToInt(Object obj) {
		return Integer.parseInt( obj.toString() );
	}
	
	public static String valueToString(Object obj) {
		if(obj == null)
			//return "";
			return null;
		else
			return obj.toString();
		
//		return obj == null ? null : obj.toString();
		
	}
}
















