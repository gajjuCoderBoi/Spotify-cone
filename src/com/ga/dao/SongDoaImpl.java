package com.ga.dao;

import com.ga.entity.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongDoaImpl implements SongDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Song> songList() {
        List<Song> songs = null;
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            songs = session.createQuery("FROM Song").getResultList();
        }finally {
            session.close();
        }
        return songs;
    }

    @Override
    public Song createSong(Song song) {
        return null;
    }

    @Override
    public Song updateSong(Song Song, Long SongId) {
        return null;
    }

    @Override
    public Song deleteSong(Long SongId) {
        return null;
    }
}