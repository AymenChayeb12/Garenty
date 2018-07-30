package web4innovation.com.garenty.category;

/**
 * Created by Aymen on 26/07/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
private List<Product> productList;
private Context context;

public CategoryAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
        }


@Override
public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);

        return new CategoryHolder(itemView);
        }

@Override
public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        bindViewHolder((CategoryHolder) holder, position);
        }

private void bindViewHolder(CategoryHolder holder, int position) {
        Product product = productList.get(position);
        holder.productText.setText(product.getName());
        Picasso.with(context).load(product.getImage()).into(holder.productImage);
        }

@Override
public int getItemCount() {
        return productList.size();
        }
        }

