package slozka;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.io.File;

import slozka.dashcam_java.R;
import slozka.dashcam_java.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private File file;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        // přidáno
        Context context = getActivity();
        File dir = new File(context.getExternalFilesDir(null).toString());

        view = getView();
        TextView textView = (TextView) view.findViewById(R.id.textview_second);

        try {
            if (dir.exists()) {
                File[] files = dir.listFiles();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < files.length; i++) {
                    sb.append(files[i].getName()).append("\n");
                }
                textView.setText(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //konec přidání
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}