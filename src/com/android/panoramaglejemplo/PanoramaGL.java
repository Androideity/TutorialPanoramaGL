package com.android.panoramaglejemplo;

import com.panoramagl.PLImage;
import com.panoramagl.PLSphericalPanorama;
import com.panoramagl.PLView;
import com.panoramagl.utils.PLUtils;

import android.os.Bundle;

public class PanoramaGL extends PLView {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PLSphericalPanorama panorama = new PLSphericalPanorama();
		panorama.setImage(this.getCurrentGL(), PLImage.imageWithBitmap(PLUtils.getBitmap(this, R.raw.rocodromo)));
		this.setPanorama(panorama);
	}
}
