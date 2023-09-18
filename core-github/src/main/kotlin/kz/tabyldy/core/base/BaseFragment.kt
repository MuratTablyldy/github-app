package kz.tabyldy.core.base

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>: Fragment() {

    protected var _binding : VB?=null

    val binding: VB get() = _binding!!


}