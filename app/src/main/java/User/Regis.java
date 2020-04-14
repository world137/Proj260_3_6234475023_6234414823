package User;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.busolympic.R;

public class Regis extends Fragment {
    private ImageView mRegister;
    private EditText mUsername;
    private EditText mPassword;
    private EditText mPassword2;
    private EditText mEmail;
    private EditText mCardNumber;
    private ImageView mBack;
    private Context mContext;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Regis() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Regis.
     */
    // TODO: Rename and change types and number of parameters
    public static Regis newInstance(String param1, String param2) {
        Regis fragment = new Regis();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        mUsername = view.findViewById(R.id.username);
        mPassword = view.findViewById(R.id.password);
        mPassword2 = view.findViewById(R.id.password2);
        mEmail = view.findViewById(R.id.email);
        mCardNumber = view.findViewById(R.id.idCard);
        mBack = view.findViewById(R.id.back);
        mRegister = view.findViewById(R.id.register);
        String username = mUsername.getText().toString();
        String password = mPassword.getText().toString();
        String confirmPassword = mPassword2.getText().toString();
        String email = mEmail.getText().toString();
        String cardNumber = mCardNumber.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if(username.length() == 0) {
            String message = getString(R.string.enter_username);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else if(email.length() == 0) {
            String message = getString(R.string.enter_email);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else if(cardNumber.length() == 0){
            String message = getString(R.string.enter_idCard);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else if(password.length() == 0){
            String message = getString(R.string.enter_password);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else if(confirmPassword.length() == 0){
            String message = getString(R.string.enter_password2);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        } else if(password.length() < 8) {
            String message = getString(R.string.password_is_to_short);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else if ( password.equals(confirmPassword)) {
            String message = getString(R.string.register_success);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }else {
            String message = getString(R.string.register_password_error);
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }
        return view;
    }

}
