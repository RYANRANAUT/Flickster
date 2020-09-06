package flickster.shopping.living.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import flickster.shopping.living.OrderDetailActivity;
import flickster.shopping.living.R;

public class ProductMyOrderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public int getItemViewType(int position) {
        if(position >= 4) return 1;
        else return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_order,parent,false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_order,parent,false);
        }

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolder) {
            ((ViewHolder) holder).bind();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        private void bind() {
            this.itemView.setOnClickListener(view -> {
                Context context = itemView.getContext();
                Intent intent = new Intent(context, OrderDetailActivity.class);
                context.startActivity(intent);
            });
        }
    }
}
