package web4innovation.com.garenty.brand;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aymen on 26/07/2017.
 */

public class BrandHolder extends RecyclerView.ViewHolder{public TextView productText, descriptionText, priceText;
    public ImageView productImage;


    public BrandHolder(View view) {
        super(view);

        productImage = (ImageView) view.findViewById(R.id.image_product);
        productText = (TextView) view.findViewById(R.id.name_text);
        descriptionText = (TextView) view.findViewById(R.id.description_text);
        priceText = (TextView) view.findViewById(R.id.price_text);
    }
}