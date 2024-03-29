package com.example.localstorage.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.localstorage.DAO.UserDAO;
import com.example.localstorage.Entity.User;
import com.example.localstorage.MainActivity;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    private static AppDataBase instance;

    public abstract UserDAO userDao();

    public static AppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class, "room_test_db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;

    }
}
