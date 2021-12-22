package com.example.codingparty.Controller;

import com.example.codingparty.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @Autowired
    BoardService boardService;

    @GetMapping("/")
    private String main(){
        return "main";
    }
    @GetMapping("/ScoreBoard")
    private String ScoreBoard(Model model){

        model.addAttribute("game1ScoreList", boardService.GetGame1SortByScore());
        model.addAttribute("game2ScoreList", boardService.GetGame2SortByScore());
        return "ScoreBoard";
    }

}
