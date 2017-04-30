package martonveto.com.mobsoft.ui.album.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import martonveto.com.mobsoft.R;
import martonveto.com.mobsoft.model.AlbumSimple;

class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    private List<AlbumSimple> albums;
    private Context context;
    private OnAlbumClickListener onAlbumClickListener;

    public AlbumAdapter(Context context, List<AlbumSimple> albums) {
        this.context = context;
        this.albums = albums;
    }

    public OnAlbumClickListener getOnAlbumClickListener() {
        return onAlbumClickListener;
    }

    public void setOnAlbumClickListener(OnAlbumClickListener onAlbumClickListener) {
        this.onAlbumClickListener = onAlbumClickListener;
    }

    @Override
    public AlbumAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card, null);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(AlbumAdapter.ViewHolder holder, int position) {
        final AlbumSimple album = albums.get(position);
        if (album != null) {
            if (album.getImages().size() > 0 && album.getImages().get(1) != null) {
                Picasso.with(context).load(album.getImages().get(1).getUrl())
                        .into(holder.imageView);
            }
            holder.textView.setText(album.getName());
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAlbumClickListener.onAlbumClick(album);
            }
        };
        holder.imageView.setOnClickListener(listener);
        holder.textView.setOnClickListener(listener);

    }

    @Override
    public int getItemCount() {
        return null != albums ? albums.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.thumbnail);
            textView = (TextView) itemView.findViewById(R.id.title);
        }

    }
}
