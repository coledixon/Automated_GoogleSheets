// sum of all comps for a given day (pivots off (L) {local} char in cell)
=SUMPRODUCT(LEN({range}})-LEN(SUBSTITUTE({range}},"(L)","()")))

// EX: implemented for Sat values in Google Sheets
=SUMPRODUCT(LEN(C62:C76)-LEN(SUBSTITUTE(C62:C76,"(L))","()")))


// C-I62:C-I76 is the range for a week of values (7-day week beginning with Sat)
// CTRL+H in notepad and replace C6 w/ D6 && C7 w/ D7 (repeat for E-I)