package es.uam.eps.dadm.cards


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kevin.example.R
import kevin.example.databinding.FragmentScreen1Binding


class Screen1Fragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentScreen1Binding>(
            inflater,
            R.layout.fragment_screen1,
            container,
            false
        )

        binding.helloButton.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_screen1Fragment_to_screen2Fragment)
        }

        return binding.root
    }
}
