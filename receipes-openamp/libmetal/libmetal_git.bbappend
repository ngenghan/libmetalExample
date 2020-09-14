# libmetal_git.bbappend content
SRC_URI_append = " \
file://0001-lib-atomic-revert-c-compilation-issue.patch \
"
 
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

