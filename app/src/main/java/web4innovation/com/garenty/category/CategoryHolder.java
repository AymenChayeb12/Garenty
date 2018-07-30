package web4innovation.com.garenty.category;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aymen on 26/07/2017.
 */

public class CategoryHolder extends RecyclerView.ViewHolder {

    public TextView productText;
    public ImageView productImage;


    public CategoryHolder(View view) {
        super(view);

        productImage = (ImageView) view.findViewById(R.id.image_category);
        productText = (TextView) view.findViewById(R.id.name_category);
    }
}
