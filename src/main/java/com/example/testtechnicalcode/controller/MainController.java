package com.example.testtechnicalcode.controller;

import com.example.testtechnicalcode.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/segitiga/{val}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ResponseDto> count(@PathVariable(name = "val") int value){
        return new ResponseEntity<>(ResponseDto.builder().bilangan("").build(), HttpStatus.OK);
    }

    @GetMapping("/ganjil/{val}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ResponseDto> ganjil(@PathVariable(name = "val") int value){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <= value; i++){
            if(i%2!=0){
                if(i == value){
                    builder.append(i);
                }else {
                    builder.append(i).append(",");
                }

            }
        }
        return new ResponseEntity<>(ResponseDto.builder().bilangan(builder.toString()).build(), HttpStatus.OK);
    }

    @GetMapping("/prima/{val}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<ResponseDto> prima(@PathVariable(name = "val") int value){
        StringBuilder builder = new StringBuilder();
        for(int j=2;j<=value;j++)
        {
            int count=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(builder.append(j).append(","));
        }
        return new ResponseEntity<>(ResponseDto.builder().bilangan(builder.toString()).build(), HttpStatus.OK);
    }
}
