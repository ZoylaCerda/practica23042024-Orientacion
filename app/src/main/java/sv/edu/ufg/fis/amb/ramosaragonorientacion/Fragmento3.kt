package sv.edu.ufg.fis.amb.ramosaragonorientacion

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragmento3 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fragmento3, container, false)
        val rootView = inflater.inflate(R.layout.fragment_fragmento3, container, false)

        var orientation = resources.configuration.orientation

        if(orientation != Configuration.ORIENTATION_LANDSCAPE){
            rootView.findViewById<TextView>(R.id.texto3).setText(R.string.texto_vertical)
        }
        return rootView
    }

}