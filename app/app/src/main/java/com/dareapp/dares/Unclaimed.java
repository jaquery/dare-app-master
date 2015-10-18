package com.dareapp.dares;

import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

/**
 * Created by pocobrio on 18/10/15.
 */
public class Unclaimed extends ListActivity
        implements LoaderManager.LoaderCallbacks<Cursor> {

    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
    }
}
