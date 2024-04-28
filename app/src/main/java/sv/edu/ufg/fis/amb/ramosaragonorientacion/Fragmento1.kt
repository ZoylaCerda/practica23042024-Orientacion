package sv.edu.ufg.fis.amb.ramosaragonorientacion

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.constraintlayout.widget.ConstraintLayout

class Fragmento1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_fragmento1, container, false)

        var orientation = resources.configuration.orientation


        if(orientation != Configuration.ORIENTATION_LANDSCAPE){
            rootView.findViewById<ImageView>(R.id.logo_horizontal).setImageResource(R.drawable.logo_vertical)
        }
        return rootView

    }

}