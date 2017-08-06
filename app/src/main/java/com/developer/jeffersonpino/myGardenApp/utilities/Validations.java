package com.developer.jeffersonpino.myGardenApp.utilities;

import android.content.Context;
import android.widget.EditText;

import com.developer.jeffersonpino.base.R;

import java.util.regex.Pattern;

/**
 * @author SHAHAB
 * @author arbofercho@gmail.com
 * @source http://tausiq.wordpress.com/2013/01/19/android-input-field-validation/
 * @date 2014-02-04
 * */

public class Validations {

    // Regular Expression
    // you can change the expression based on your need
    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PHONE_REGEX = "\\d{3}-\\d{7}";
    // Error Messages
    private static String REQUIRED_MSG = "Required";
    private static String EMAIL_MSG = "Invalid email";
    private static String NO_USES_INVALID_CHARS_MSG = "No uses quotes";
    private static final String PHONE_MSG = "##########";
    public static String INVALID_PASSWORD="Invalid Password";

    public static void init(Context context) {
        REQUIRED_MSG = context.getString(R.string.field_required);
        EMAIL_MSG = context.getString(R.string.email_bad);
        NO_USES_INVALID_CHARS_MSG = context.getString(R.string.dont_uses_invalid_chars);
    }

    // call this method when you need to check email validation
    public static boolean isEmailAddress(EditText editText, boolean required) {
        return isValid(editText, EMAIL_REGEX, EMAIL_MSG, required);
    }

    // call this method when you need to check phone number validation
    public static boolean isPhoneNumber(EditText editText, boolean required) {
        return isValid(editText, PHONE_REGEX, PHONE_MSG, required);
    }

    // return true if the input field is valid, based on the parameter passed
    public static boolean isValid(EditText editText, String regex, String errMsg, boolean required) {

        String text = editText.getText().toString().trim();
        // clearing the error, if it was previously set by some other values
        editText.setError(null);

        // text required and editText is blank, so return false
        if ( required && !hasText(editText) ) return false;

        // pattern doesn't match so returning false
        /*if (required && !Pattern.matches(regex, text)) {
            editText.setError(errMsg);
            return false;
        }*/

        //arbofercho@gmail.com: si tiene texto y no cumple con la expresion
        if (hasText(editText) && !Pattern.matches(regex, text)) {
            editText.setError(errMsg);
            return false;
        } else {
            editText.setError(null);
        }

        if(hasInvalidChars(editText)) {
            return false;
        }

        return true;
    }

    // check the input field has any text or not
    // return true if it contains text otherwise false
    public static boolean hasText(EditText editText) {

        String text = editText.getText().toString().trim();
        editText.setError(null);

        // length 0 means there is no text
        if (text.length() == 0) {
            editText.setError(REQUIRED_MSG);
            return false;
        }

        if(hasInvalidChars(editText)) {
            return false;
        }

        return true;
    }

    /**
     * Metodo encargado de validar si un campo de texto contiene alguno de los caracteres no permitidos
     * @author arbofercho@gmail.com
     * @date 2014-02-04
     * */
    public static boolean hasInvalidChars(EditText editText) {
        String text = editText.getText().toString().trim();
        if (text.contains("\"") || text.contains("'") || text.contains("/") || text.contains("{") || text.contains("}")
                || text.contains("[") || text.contains("]")) {
            editText.setError(NO_USES_INVALID_CHARS_MSG);
            return true;
        }

        return false;
    }


}
