package com.example.questionnaire.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questionnaire.entity.QuestionnaireBackGround;
@Repository
public interface QuestionnaireBackGroundDao extends JpaRepository<QuestionnaireBackGround, Integer>{

}
