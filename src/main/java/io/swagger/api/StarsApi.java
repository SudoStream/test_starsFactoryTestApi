package io.swagger.api;

import io.swagger.model.StarDetails;
import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-16T16:50:29.819Z")

@Api(value = "stars", description = "the stars API")
public interface StarsApi {

    @ApiOperation(value = "All the stars in the system", notes = "Lists all the stars currently in the system ", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved list of all stars", response = String.class) })
    @RequestMapping(value = "/stars",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> starsGet();


    @ApiOperation(value = "Create a new star", notes = "This operation will create a new star so long as it doesn't already exist. ", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new star", response = InlineResponse200.class),
        @ApiResponse(code = 409, message = "There is already a star with that name", response = InlineResponse200.class) })
    @RequestMapping(value = "/stars",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> starsPost(@ApiParam(value = "" ,required=true ) @RequestBody StarDetails starDetails);


    @ApiOperation(value = "Let's destroy the star", notes = "If the starId exists then this destroy it.", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Star destroyed", response = String.class),
        @ApiResponse(code = 404, message = "There ain't no star by that name", response = String.class) })
    @RequestMapping(value = "/stars/{starId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> starsStarIdDelete(@ApiParam(value = "ID of star to fetch",required=true ) @PathVariable("starId") String starId);


    @ApiOperation(value = "Says hello to the star", notes = "If the starId exists then this will say hello to it.", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Stars exists, let's say hello.", response = String.class),
        @ApiResponse(code = 404, message = "There ain't no star by that name", response = String.class) })
    @RequestMapping(value = "/stars/{starId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> starsStarIdGet(@ApiParam(value = "ID of star to fetch",required=true ) @PathVariable("starId") String starId);

}
