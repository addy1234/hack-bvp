package com.developer.jatin.hack_bvp;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.developer.jatin.hack_bvp.R.id.center;
import static com.developer.jatin.hack_bvp.R.id.toolbar;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Talks.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Talks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Talks extends Fragment {
    TextView publicspeaking_text,writing_text,python_text,maths_text,prespeaking,prewriting,prepython,premaths;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Talks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Talks.
     */
    // TODO: Rename and change types and number of parameters
    public static Talks newInstance(String param1, String param2) {
        Talks fragment = new Talks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_start, container, false);

        publicspeaking_text=(TextView)view.findViewById(R.id.text_englishspeaking);
        writing_text=(TextView)view.findViewById(R.id.text_writing);
        python_text=(TextView)view.findViewById(R.id.text_python);
        maths_text=(TextView)view.findViewById(R.id.text_basicmaths);


       premaths=(TextView)view.findViewById(R.id.prerequistie_maths);
        prepython=(TextView)view.findViewById(R.id.prerequistie_python);
        prewriting=(TextView)view.findViewById(R.id.prerequistie_writing);
        prespeaking=(TextView)view.findViewById(R.id.prerequistie_english_speaking);

   premaths.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
           alert.setTitle("For maths");
//                ImageView imageView=new ImageView(Links_activity.this);
           TextView textView=new TextView(getActivity());
           textView.setText("Basic knowledge of trigonometry");
           textView.setGravity(center);
           textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

           alert.setView(textView);
           alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int id) {
                   dialog.dismiss();
               }
           });
           alert.show();
       }
   });

        prepython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For python");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Nothing required");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });

        prewriting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For writting");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("English required");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
        prespeaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For speaking");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Knowledge of english is required");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
        publicspeaking_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("Speaking Skills");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Even if you don't need to make regular presentations   in front of a group, there are plenty of situations where good public speaking skills can help you advance your career and create opportunities.\n" +
                        "\n" +
                        "For example, you might have to talk about your organization at a conference, make a speech after accepting an award, or teach a class to new recruits. Speaking to an audience also includes online presentations or talks; for instance, when training a virtual team, or when speaking to a group of customers in an online meeting.\n" +
                        "\n" +
                        "Good public speaking skills are important in other areas of your life, as well. ");
                textView.setGravity(center);
                 textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.setPositiveButton("Share", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "share with friends");
                        sendIntent.setType("text/plain");
                        startActivity(Intent.createChooser(sendIntent, "share"));
//                        toolbar.setBackgroundColor(Color.parseColor("#0084a8"));

//                        Toast.makeText(getActivity(),"Post shared",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
        writing_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("Writing - Skills");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Today, when anyone can be their own publisher, we see more and more examples of poor writing skills both in print and on the web.  Poor writing skills create poor first impressions and many readers will have an immediate negative reaction if they spot a spelling or grammatical mistake. As just one example, a spelling mistake on a commercial web page may cause potential customers to doubt the credibility of the website and the organisation.\n" +
                        "\n" +
                        "Read more at: https://www.skillsyouneed.com/writing-skills.html ");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.setPositiveButton("Share", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
//                        Toast.makeText(getActivity(),"Post shared",Toast.LENGTH_SHORT).show();

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "share with friends");
                        sendIntent.setType("text/plain");
                        startActivity(Intent.createChooser(sendIntent, "share"));
//                        toolbar.setBackgroundColor(Color.parseColor("#0084a8"));

                    }
                });
                alert.show();
            }
        });
        python_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("Python");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Python is a dynamic, interpreted (bytecode-compiled) language. There are no type declarations of variables, parameters, functions, or methods in source code. This makes the code short and flexible, and you lose the compile-time type checking of the source code. Python tracks the types of all values at runtime and flags code that does not make sense as it runs.\n" +
                        "\n" +
                        "An excellent way to see how Python code works is to run the Python interpreter and type code right into it.  ");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.setPositiveButton("Share", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
//                        Toast.makeText(getActivity(),"Post shared",Toast.LENGTH_SHORT).show();

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "share with friends");
                        sendIntent.setType("text/plain");
                        startActivity(Intent.createChooser(sendIntent, "share"));
//                        toolbar.setBackgroundColor(Color.parseColor("#0084a8"));

                    }
                });
                alert.show();
            }
        });
        maths_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("maths");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText(" Through the use of abstraction and logic, mathematics developed from counting, calculation, measurement, and the systematic study of the shapes and motions of physical objects.\n Practical mathematics has been a human activity from as far back as written records exist.\n The research required to solve mathematical problems can take years or even centuries of sustained inquiry.");
                textView.setGravity(center);
                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.setPositiveButton("Share", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "share with friends");
                        sendIntent.setType("text/plain");
                        startActivity(Intent.createChooser(sendIntent, "share"));
//                        toolbar.setBackgroundColor(Color.parseColor("#0084a8"));

                    }
                });
                alert.show();
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
