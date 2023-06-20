package com.netwerkapp.game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netwerkapp.R;

import java.util.List;

public class GameRecyclerviewAdapter extends RecyclerView.Adapter<GameRecyclerviewAdapter.GameRecyclerviewHolder> {
    private final View view;
    private List<User> users;

    public GameRecyclerviewAdapter(View view, List<User> users) {
        this.view = view;
        this.users = users;
    }

    @NonNull
    @Override
    public GameRecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(view.getContext());
        View view = inflater.inflate(R.layout.game_row, parent, false);

        return new GameRecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameRecyclerviewHolder holder, int position) {
        User user = users.get(position);
        holder.name.setText(user.getUsername());
        holder.length.setText("Length: " + user.getAnswerLength());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class GameRecyclerviewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView length;

        public GameRecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.username_row);
            length = itemView.findViewById(R.id.length_row);
        }
    }
}
