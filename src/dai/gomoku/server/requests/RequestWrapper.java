package dai.gomoku.server.requests;

import com.google.gson.annotations.SerializedName;

/**
 * This class was created to help in a pseudo-polymorphic parsing of the passed
 * in JSON. What happens is that the JSON is read and the information stored in
 * the relevant fields in this class.
 * 
 * From there, the object formed by parsing the JSON is passed in to the
 * {@link RequestFactory} which then generates the appropriate types of
 * {@link Request} objects depending on the value of the {@link type} field
 * 
 * As more types of requests are needed, the code in this class will change to
 * allow fields holding the values required for creation of the relevant types
 * of {@link Request} object.
 * 
 * @author Muriithi Frederick Muriuki
 * 
 */
public class RequestWrapper {
	@SerializedName("type")
	private String type;

	@SerializedName("username")
	private String username;

	@SerializedName("password")
	private String password;

	@SerializedName("gameID")
	private String gameID;

	@SerializedName("row")
	private int row;

	@SerializedName("col")
	private int col;

	@SerializedName("challengerUsername")
	private String challengerUsername;

	@SerializedName("chalengeeUsername")
	private String challengeeUsername;

	@SerializedName("message")
	private String message;

	/*
	 * The accessor methods
	 */

	public String getType() {
		return type;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the gameID
	 */
	public String getGameID() {
		return gameID;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}

	/**
	 * @return the challengerUsername
	 */
	public String getChallengerUsername() {
		return challengerUsername;
	}

	/**
	 * @return the challengeeUsername
	 */
	public String getChallengeeUsername() {
		return challengeeUsername;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}
