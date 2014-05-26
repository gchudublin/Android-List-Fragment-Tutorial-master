package ru.artemzin.android.tutorials.listfragmentexample;

import ru.artemzin.android.tutorials.listfragmentexample.R;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Simple class for showing List of elements in Fragment
 * @author Artem Zinnatullin
 * @see http://android.artemzin.ru/?p=7
 *
 */
public class SimpleListFragment extends ListFragment {
	
	/**
	 * Array with strings to show in list
	 */
	private String dataArray[];
	
	public SimpleListFragment() {
		dataArray = new String[] {
				"One",
				"Two",
				"Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three",
                "One",
                "Two",
                "Three"

		};
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * ListAdapter will get info from dataArray and put it to the list
		 */
		ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, dataArray);
		setListAdapter(listAdapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.simple_list_fragment, container, false);
	}
	
	@Override
	public void onListItemClick(ListView list, View v, int position, long id) {
		/**
		 * Toast message will be shown when you click any list element
		 */
		Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
	}
}
