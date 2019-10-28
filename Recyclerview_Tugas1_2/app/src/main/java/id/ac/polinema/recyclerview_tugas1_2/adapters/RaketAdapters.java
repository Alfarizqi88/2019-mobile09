package id.ac.polinema.recyclerview_tugas1_2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerview_tugas1_2.R;
import id.ac.polinema.recyclerview_tugas1_2.models.RaketModels;

public class RaketAdapters extends RecyclerView.Adapter<RaketAdapters.MyViewHolder>{
    List<RaketModels> raketModelsList;

    public RaketAdapters(List<RaketModels> raketModelsList) {
        this.raketModelsList = raketModelsList;
    }
    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_raket,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RaketAdapters.MyViewHolder holder, int position) {
        RaketModels raket = raketModelsList.get(position);
        holder.image.setImageResource(raket.getImage());
        holder.merk.setText(raket.getMerk());
        holder.frame.setText("Frame \t :" +raket.getFrame());
        holder.color.setText("Color \t :" +raket.getColor());
    }

    @Override
    public int getItemCount() {
        return (raketModelsList != null) ? raketModelsList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView merk;
        public TextView frame;
        public TextView color;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.gambar);
            merk = itemView.findViewById(R.id.merk);
            frame = itemView.findViewById(R.id.frame);
            color = itemView.findViewById(R.id.color);
        }
    }
}
