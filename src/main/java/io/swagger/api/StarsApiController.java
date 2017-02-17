package io.swagger.api;

import io.swagger.model.StarDetails;
import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-16T16:50:29.819Z")

@Controller
public class StarsApiController implements StarsApi {

    final Map<String, StarDetails> stars = new HashMap<>();

    public ResponseEntity<List<String>> starsGet() {
        final List<String> starNames = new ArrayList<>(stars.keySet());
        System.out.println("starsGet called");
        return new ResponseEntity<List<String>>(starNames, HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> starsPost(@ApiParam(value = "" ,required=true ) @RequestBody StarDetails starDetails) {
        stars.put(starDetails.getStarName(), starDetails);
        System.out.println("starsPost called");
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<String> starsStarIdDelete(@ApiParam(value = "ID of star to fetch",required=true ) @PathVariable("starId") String starId) {
        stars.remove(starId);
        System.out.println("starsStarIdDelete called");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> starsStarIdGet(@ApiParam(value = "ID of star to fetch",required=true ) @PathVariable("starId") String starId) {
        stars.get(starId).toString();
        System.out.println("starsStarIdGet called");
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
