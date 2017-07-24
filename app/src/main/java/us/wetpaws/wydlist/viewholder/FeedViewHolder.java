package us.wetpaws.wydlist.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import us.wetpaws.wydlist.R;

/**
 * Created by HTDWPS on 7/24/17.
 */

public class FeedViewHolder extends RecyclerView.ViewHolder {

    private ImageView bucketlist_bg_image;
    private TextView bucketlist_post_title;
    private TextView bucketlist_post_timestamp;

    public FeedViewHolder(View itemView) {
        super(itemView);

        bucketlist_bg_image = (ImageView) itemView.findViewById(R.id.bucketlist_image);
        bucketlist_post_title = (TextView) itemView.findViewById(R.id.bucketlist_title_text);
        bucketlist_post_timestamp = (TextView) itemView.findViewById(R.id.bucketlist_date_timestamp);
    }

    // TODO: Create the setter methods.

}