package todo.example.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.todo.R

class ListFragment {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragment_list, container, false)

    }
}