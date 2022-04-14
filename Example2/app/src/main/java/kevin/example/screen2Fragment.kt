package es.uam.eps.dadm.cards


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kevin.example.R
import kevin.example.databinding.FragmentScreen2Binding


class Screen2Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentScreen2Binding>(
            inflater,
            R.layout.fragment_screen2,
            container,
            false
        )

        binding.backButton.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_screen2Fragment_to_screen1Fragment)
        }

        binding.change.setOnClickListener {
            if (binding.msg.text.equals("HOLA"))
                binding.msg.text = "ADIOS"
            else
                binding.msg.text = "HOLA"
        }

        return binding.root
    }
}
