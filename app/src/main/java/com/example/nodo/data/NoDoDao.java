package com.example.nodo.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.nodo.model.NoDo;

import java.util.List;

@Dao
public interface NoDoDao {

    @Insert
    void insert(NoDo nodo);

    @Query("DELETE FROM noDo_table")
    void deleteAll();

    @Query("DELETE FROM noDo_table WHERE id =:id")
    int DeleteANoDo(int id);

    @Query("UPDATE noDo_table SET nodo_col =:nodoText WHERE id =:id")
    int UpdateNoDoItem(int id, String nodoText);

    @Query("SELECT * FROM noDo_table ORDER BY nodo_col DESC")
    LiveData<List<NoDo>> getAllNoDos();


}
