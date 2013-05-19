package com.example.viktor.master.thesis.test.gephi;

import org.gephi.graph.api.GraphController;
import org.gephi.graph.api.GraphModel;
import org.openide.util.Lookup;

import android.app.Activity;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends Activity {

	//memebers
	private android.opengl.GLSurfaceView GLSurfaceView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GLSurfaceView = (android.opengl.GLSurfaceView) findViewById(R.id.surfaceView1);
		this.InitializeGephi();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	//Initializing Gephi graph
	private void InitializeGephi()
	{
		//GraphController gc = Lookup.getDefault().lookup(GraphController.class);
	}
}
