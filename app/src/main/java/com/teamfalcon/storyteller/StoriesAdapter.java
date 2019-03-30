package com.teamfalcon.storyteller;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.MyViewHolder> {

    private List<Story> storiesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, author,createdAt,description;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            author = (TextView) view.findViewById(R.id.author);
            createdAt = (TextView) view.findViewById(R.id.createdAt);
            description = (TextView) view.findViewById(R.id.description);
        }
    }


    public StoriesAdapter(List<Story> storiesList) {
        this.storiesList = storiesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.story_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Story story = storiesList.get(position);
        holder.title.setText(story.getTitle());
        holder.author.setText(story.getAuthorName());
        holder.createdAt.setText(story.getCreatedAt());
        holder.description.setText(story.getDescription());
    }

    @Override
    public int getItemCount() {
        return storiesList.size();
    }
}