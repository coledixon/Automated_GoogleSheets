// sum of all comps for a given day (pivots off (O) {online} char in cell)
=SUMPRODUCT(LEN({range}})-LEN(SUBSTITUTE({range}},"(O)","()")))

// EX: implemented for Sat values in Google Sheets
=SUMPRODUCT(LEN(C3:C17)-LEN(SUBSTITUTE(C3:C17,"(O))","()")))


// C-I62:C-I76 is the range for a week of values (7-day week beginning with Sat)
