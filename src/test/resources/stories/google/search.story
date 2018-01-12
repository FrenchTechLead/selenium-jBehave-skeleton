Narrative:
  A user wants to search for something on Google.

Scenario: Checking a search result on a given position.

Given User searches for <searchWord>
When User gets results
And User clicks on result number <resultNumber>
Then User goes to a new website
Examples:
|searchWord|resultNumber
|toto|1