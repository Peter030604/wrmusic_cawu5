package com.example.wrmusic_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product currentProduct = Product.products.get(position);
        holder.productPriceTv.setText(currentProduct.getProductPrice().toString());
        holder.productNameTv.setText(currentProduct.getProductName());
    }

    @Override
    public int getItemCount() {
        return Product.products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView productNameTv;
        TextView productPriceTv;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productNameTv = itemView.findViewById(R.id.productNameTv);
            productNameTv = itemView.findViewById(R.id.productPriceTv);
        }

    }
}
