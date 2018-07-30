package web4innovation.com.garenty.cart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Aymen on 26/07/2017.
 */

public class CartProductAdapter extends BaseAdapter {
    private List<Product> productList;

    public CartProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem (int position){
        return productList.get(position);
    }

    @Override
    public long getItemId (int position){
        return position;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_layout, parent, false );

        ImageView productImage = view.findViewById(R.id.imageId);

        Product product = productList.get(position);

        if (product != null) {

            Picasso.with(parent.getContext()).load(product.getImage()).into(productImage);
        }

        return view;
    }
}

}
