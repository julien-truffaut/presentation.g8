# $title$

Code in `core` module is accessible in your slides

Raw slides are in `slides/tut/index.html`

### How to compile slides

run `sbt slides/tut` to compile slides using [tut][tut]. 
You can then view the slides by opening `docs/index.html` in your browser.

### How to publish slides with github

When you are ready push the repository to github (including the compiled slides in `docs`).
Then go to project settings -> GitHub Pages and select `master branch /docs folder` for 
the source of github pages.



This project was generated using [Giter8][g8] with template [presentation.g8][presentation.g8]


[g8]: http://www.foundweekends.org/giter8/
[presentation.g8]: https://github.com/julien-truffaut/presentation.g8
[tut]: https://github.com/tpolecat/tut