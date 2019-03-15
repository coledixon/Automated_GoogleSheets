// sum of all comps for a given day (pivots off (L) {local} char in cell)
=SUMPRODUCT(LEN({range}})-LEN(SUBSTITUTE({range}},"(L)","()")))

// EX: implemented for Sat values in Google Sheets
=SUMPRODUCT(LEN(C3:C17)-LEN(SUBSTITUTE(C2:C17,"(L))","()")))


// C-I3:C-I17 is the range for a week of values (7-day week beginning with Sat)
