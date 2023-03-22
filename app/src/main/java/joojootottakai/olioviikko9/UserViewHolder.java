package joojootottakai.olioviikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userPhoto;
    TextView txtFirstName, txtLastName, txtEmail, txtDegree;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userPhoto = itemView.findViewById(R.id.userPhoto);
        txtFirstName = itemView.findViewById(R.id.txtFirstName);
        txtLastName = itemView.findViewById(R.id.txtLastName);
        txtEmail = itemView.findViewById(R.id.txtEmail);
        txtDegree = itemView.findViewById(R.id.txtDegree);
    }
}
